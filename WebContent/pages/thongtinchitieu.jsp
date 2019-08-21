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
	         	<h3 class="text-danger text-center">${sukien.TENSUKIEN}</h3>
				<form>
				  <div class="form-row">
				    <div class="form-group col-md-3">
				      <label for="inputsl">Số Lượng Tham Gia :</label>
				      <input type="text" class="form-control" id="inputsl"  placeholder="${sukien.SLTHAMGIA}" disabled>
				    </div>
				     <div class="form-group col-md-6">
					    <label for="input">Người Tổ chức :</label>
					    <input type="text" class="form-control" id="input" placeholder="${sukien.NGUOITOCHUC}" disabled>
					  </div>
					  <div class="form-group col-md-3">
					    <label for="input">Ngày Diễn Ra :</label>
					    <input type="text" class="form-control" id="input" placeholder="${sukien.NGAYTOCHUC}" disabled>
					  </div>
				  </div>
				 	
				 	<div class="form-group">
					    <label for="input">Địa Điểm Diễn Ra :</label>
					    <input type="text" class="form-control" id="input" placeholder="${sukien.DIADIEM}" disabled>
					</div>
				   <div class="form-group">
					    <label for="input">Khách Mời :</label>
					    <input type="text" class="form-control" id="input" placeholder="${sukien.KHACHMOI}" disabled>
					</div>
					
					<div class="form-row">
				    <div class="form-group col-md-3">
				      <label for="inputsl">Số tiền Chi Tiêu :</label>
				      <input type="text" class="form-control" id="inputsl" placeholder="${chitieu.SOTIENCHI}" disabled>
				    </div>
				     <div class="form-group col-md-3">
					    <label for="input">Số tiền dư :</label>
					    <input type="text" class="form-control" id="input" placeholder="${chitieu.TIENDU}" disabled>
					  </div>
					  <div class="form-group col-md-3">
					    <label for="input">Tiền đi chợ :</label>
					    <input type="text" class="form-control" id="input" placeholder="${chitieu.TIENCHO}" disabled>
					  </div>
					  <div class="form-group col-md-3">
					    <label for="input">Tiền Cắm Hoa :</label>
					    <input type="text" class="form-control" id="input" placeholder="${chitieu.TIENCAMHOA}" disabled>
					  </div>
					  <div class="form-group col-md-3">
					    <label for="input">Tiền Trò Chơi :</label>
					    <input type="text" class="form-control" id="input" placeholder="${chitieu.TIENTROCHOI}" disabled>
					  </div>
					  <div class="form-group col-md-9">
					    <label for="input">Tiền chi tiêu khác :</label>
					    <input type="text" class="form-control" id="input" placeholder="${chitieu.CHITIEUKHAC}" disabled>
					  </div>
				  </div>
				</form>
	  			<a href="${pageContext.request.contextPath}/mass?loai=${sukien.MALOAI}" class="btn btn-info  pull-left" role="button">Quay lại</a>
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
  
	<!-- Bootstrap core JavaScript-->
  <jsp:include page="../user/filejs.jsp"></jsp:include>
	</div>
</body>
</html>