<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="en">

<head>
	<jsp:include page="../user/head.jsp"></jsp:include>
</head>
<body id="page-top">
	<div id="wrapper">
		<jsp:include page="../user/_menu.jsp"></jsp:include>
		
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				<jsp:include page="../user/_header.jsp"></jsp:include>
				
				<!-- Begin Page Content -->
         <div class="container-fluid">

          <!-- Page Heading -->
          <h1 class="h3 mb-2 text-gray-800">Danh sách Thông Tin Các Sự Kiện</h1>
        
          <!-- DataTales Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">${event}</h6>
            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>STT</th>
                      <th>Tên Sự Kiện</th>
                      <th>Ngày</th>
                      <th>Đứng Đầu</th>
                      <th>Số Lượng</th>
                     
                      <th>Cập nhật</th> 
                    </tr>
                  </thead>
                 
                  <tbody>
                  	 <% int i = 1; %>
                  	<c:forEach items = "${DsSuKien}" var="sukien">
                    <tr>
                      <td><%=i%></td>
                      <% i = i + 1; %>
                      <td>${sukien.TENSUKIEN}</td>
                       <td>${sukien.NGAYTOCHUC}</td>
                       <td>${sukien.NGUOITOCHUC}</td>
                      <td>${sukien.SLTHAMGIA}</td>
                      
                      
                     
                      <td>
                      	<a href="${pageContext.request.contextPath}/chitiethoadon?masukien=${sukien.MASUKIEN}" class="btn btn-info" role="button">Chi tiết</a>
                      	<a href="${pageContext.request.contextPath}/xoasukien?masukien=${sukien.MASUKIEN}" class="btn btn-danger" role="button">Xóa</a>
                      </td>
                    </tr>
                   
                    </c:forEach>
                  </tbody>
                </table>
              </div>
            </div>
          </div>

        </div>
        <!-- /.container-fluid -->
			</div>
			<jsp:include page="../user/_footer.jsp"></jsp:include>
		</div>
		
	</div>
	
	
	<!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Thông báo</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Bạn có muốn thoát không ?</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Ở lại</button>
          <a class="btn btn-primary" href="${pageContext.request.contextPath}/logout">Thoát</a>
        </div>
      </div>
    </div>
  </div>
  
	<!-- Bootstrap core JavaScript-->
  <jsp:include page="../user/filejs.jsp"></jsp:include>
	
</body>
</html>