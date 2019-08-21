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
	         	<h3 class="text-danger text-center">Hồ Sơ Sinh Viên</h3>
				 
				 
							
				 
				  <div class="form-row">				  	
				  	<div class="form-group col-md-4">
				      <img src="./images/avatars/${sv.AVATAR}" width="250px" height="auto" >
				    </div>				  	  	
				    <div class="form-group col-md-8 ">		    	
				    	<div class="form-row">
				    		<div class ="col-md-6">
					    		<label for="inputsl">Họ và Tên :</label>
					     		 <input type="text" class="form-control" id="inputsl"  placeholder="${sv.HOTEN}" disabled>
					    	</div>
							    <div class="form-group col-md-3">
							      <label for="inputsl">Ngày sinh :</label>
							      <input type="text" class="form-control" id="inputsl" placeholder="${sv.NGAYSINH}" disabled>
							    </div>
							     <div class="form-group col-md-3">
								    <label for="input">Số điện thoại :</label>
								    <input type="text" class="form-control" id="input" placeholder="${sv.SDT}" disabled>
								  </div>
								<div class ="form-group col-md-10">
						    		<label for="input">Địa chỉ nhà :</label>
							    	<input type="text" class="form-control" id="input" placeholder="${sv.DIACHI}" disabled>
						    	</div>
						    	<div class="form-group col-md-10">
								    <label for="input">Tên trường học :</label>
								    <input type="text" class="form-control" id="input" placeholder="${sv.TENTRUONGHOC}" disabled>
								</div>				
							    <div class="form-group col-md-10">
							      <label for="inputsl">Học Ngành :</label>
							      <input type="text" class="form-control" id="inputsl" placeholder="${sv.KHOA_MAKHOA}" disabled>
				 				</div>
				 				<div class="form-group col-md-10">
				 					<a href="${pageContext.request.contextPath}/sinhvien" class="btn btn-info  pull-left" role="button">Quay lại danh sách</a>
				 				</div>
					  	</div>
				    	
				    	
				      
				    </div>
				 
				  </div>	
	  			
				</div>
				
		</div>
		<jsp:include page="../user/_footer.jsp"></jsp:include>
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
  
  <!-- xoa sinh vien hay khong-->
  <div class="modal fade" id="xoasinhvienModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
	</div>
</body>
</html>