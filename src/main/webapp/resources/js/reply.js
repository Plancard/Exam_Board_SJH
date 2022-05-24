$(function(){
	replyShow();
});

function replyShow(){
	
	var r_boardNum = $('#r_boardNum').val();
	var r_writer = $('#r_writer').val();
	
         $.ajax({
               type: "POST",               
               url: "/replyShow",
               data: {r_boardNum:r_boardNum},    
               success: function(data) {
                  console.log(data);
                  var replyTBL = "<table border='1'><tr><td>작성자</td><td>작성내용</td><td>삭제</td></tr>";
                  $(data).each(function(){
                     if(r_writer == this.r_writer){
                      replyTBL += "<tr><td>"+this.r_writer+"</td><td>"
                  + this.r_content + "</td><td><button onclick='replyDelete("+this.r_no+")'>삭제하기</button></td></tr>";
                  }else{
                     replyTBL += "<tr><td>"+this.r_writer+"</td><td>"
                  + this.r_content + "</td><td></td></tr>";
                  }
                  });
               replyTBL += "</table>";
               
               $('#replyShowZone').html(replyTBL);
               },
               error:function(request, status, error){
                  alert("code:"+request.status
                  +"\n"+"message:"+request.responseText
                  +"\n"+"error:"+error);
                  console.log("code:"+request.status);
                  console.log("message:"+request.responseText);
                  console.log("error:"+error);					
               }
            });
}

         function replyDelete(r_no){
            $.ajax({
                  type: "POST",               
                  url: "/replyDelete",     
                  data: {r_no:r_no},         
                  success: function(){ 
                     $('#replyShowZone').html('');
                     replyShow();
                     },
                  error:function(request, status, error){
         
                     alert("code:"+request.status
                     +"\n"+"message:"+request.responseText
                     +"\n"+"error:"+error);
                  }
               });
            
         }

$('#replyBtn').click(function(){
	
     var r_boardNum = $('#r_boardNum').val();
     var r_writer = $('#r_writer').val();
     var r_content = $('#r_content').val();

	if(r_content == ""){
		alert('댓글 내용을 작성해주세요');
		return;
	}
              
		$.ajax({
			type: 'POST',
			url: '/replyInsert',
			data: {
				r_boardNum : r_boardNum,
				r_writer : r_writer,
				r_content : r_content
			},
			success: function(data) {
					if(data == "Success"){
						$('#r_content').val("");
						replyShow();
					}
				},
			error:function(request, status, error){
				alert("code:"+request.status
				+"\n"+"message:"+request.responseText
				+"\n"+"error:"+error);
		}
	});
});