<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%-- <h2>${modify.boardNo}번 게시물 수정화면</h2>
	
	<form action="basic/board/modify" method="post">
	<input type="hidden" name="boardNo" value="${modify.boardNo}">
        <p>
            # 작성자: <input type="text" name="writer" value="${modify.writer}"> <br>
            # 제목: <input type="text" name="title" value="${modify.title}"> <br>
            # 내용: <textarea rows="3" name="content" >${modify.content}</textarea> <br>
            <input type="submit" value="등록"> 
        </p>
    </form> --%>
    
    <h2>${article.boardNo}번 게시글 수정</h2>
    <form method="post">
    	<input type="hidden" name="boardNo" value=${article.boardNo}>
    	<p>
    		# 작성자: <input type="text" name="writer" value="${article.writer}"> <br>
    		# 제목: <input type="text" name="title" value="${article.title}"> <br>
    		# 내용: <textarea rows="3" name="content">${article.content}</textarea> <br>
    		<input type="submit" value="수정">
    	</p>
    </form>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
</body>
</html>