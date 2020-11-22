<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700;900&display=swap"
	rel="stylesheet">


<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.js"></script>
<style>
* {
	font-family: 'Noto Sans KR';
}

.footer-all-wrap {
	display: flex;
	justify-content: center;
}

.footer-wrap {
	width: 1300px;
	height: 180px;
	background-color: #383a3f;
	box-sizing: border-box;
	overflow: hidden;
}

.text>p {
	color: #f9a11b;
	margin: 0;
	padding: 0;
	line-height: 60px;
	font-size: 2em;
	font-weight: bold;
	padding-top: 27px;
	text-indent: 2em;
}

.text>span {
	color: white;
	text-indent: 4em;
	display: block;
}

.col-md-6 {
	height: 180px;
	float: left;
	box-sizing: border-box;
	margin: 0;
	padding: 0;
	overflow: hidden;
}

.footer-info {
	width: 100%;
	height: 50%;
	box-sizing: border-box;
	float: left;
	display: flex;
	justify-content: center;
	align-items: center;
}

.footer-info>span {
	color: white;
}

.footer-sns {
	width: 100%;
	height: 50%;
	box-sizing: border-box;
	float: left;
	display: flex;
	justify-content: center;
	align-items: flex-start;
}

.footer-img {
	width: 50px;
	height: 50px;
	background-color: pink;
}
</style>
</head>
<body>
	<div class="footer-all-wrap">
		<div class="footer-wrap">
			<div class="col-md-6 text">
				<p>모방의 민족</p>
				<span>(07212) 서울특별시 영등포구 선유동2로 57 이레빌딩(구관) 19F A강의실</span> <span> TEL. 02)1544-9970 |
					FAX. 02)2163-8560 | 사업자등록번호 : 876-85-00632 </span>
			</div>
			<div class="col-md-6">
				<div class="footer-info">
					<ul class="nav justify-content-center">
						<li class="nav-item"><a class="nav-link" href="#">이용약관</a></li>
						<li class="nav-item"><a class="nav-link" href="#">개인정보처리방침</a></li>
						<li class="nav-item"><a class="nav-link" href="#">공지사항</a></li>
					</ul>
				</div>
				<div class="footer-sns">
					<ul class="nav justify-content-center">
						<li class="nav-item"><a class="nav-link" href="#"><div class="footer-img"></div></a></li>
						<li class="nav-item"><a class="nav-link" href="#"><div class="footer-img"></div></a></li>
						<li class="nav-item"><a class="nav-link" href="#"><div class="footer-img"></div></a></li>
						<li class="nav-item"><a class="nav-link" href="#"><div class="footer-img"></div></a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
</html>