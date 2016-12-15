<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>광고관리 페이지</title>
		<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
		<script src="resources/bootstrap/js/bootstrap.js"></script>
		<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.css" />
		<style>
			#managerCategori{
				
			}
			.table{
				width: 100%;
			}
			th{
				text-align: center;
			}
		</style>
	</head>
	<body>
		<jsp:include page="../../resources/include/logo.jsp" />
		<jsp:include page="../../resources/include/nav.jsp" />
		<div class="layer">
			<div class="page">
				
				<!-- 첫 번째 구역 -->
				<div class="col2 content">
					<div id="title">
						<h1><b>광고 관리</b></h1>
					</div>
					<div class="right">
						<jsp:include page="../../resources/include/manager.jsp" />
					</div>
				</div>
				
				<!-- 두 번째 구역 -->
				<div class="col5 content">
					<div class="right">
						<button>검색</button>
						<input type="text" />
					</div>
					<div id="">
						<table class="table table-hover totalTable">
							<thead>
								<tr>
									<th>NO</th>
									<th>제목</th>
									<th>유형</th>
									<th>담당자</th>
									<th>광고주</th>
									<th>날짜</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>0</td>
									<td>OOO</td>
									<td>OOOOO</td>
									<td>OOOOO</td>
									<td>OOO</td>
									<td>OOOOOO</td>
								</tr>
							</tbody>
						</table>
						<button>광고 추가</button>
					</div>
				</div>	
			</div>
		</div>
	</body>
	<script></script>
</html>