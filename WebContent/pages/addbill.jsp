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
          <h1 class="h3 mb-2 text-gray-800">Chi Tiêu Cho Sự Kiện</h1>
          <form  method="POST" action="${pageContext.request.contextPath}/addbill">
			 
			  <div class="form-row">
			    <div class="form-group col-md-3">
			      <label for="inputMaloai">Số Tiền Chi</label>
			      <input type="text" name="sotienchi" class="form-control money numbers"  placeholder="Nhập số tiền đã chi">
			    </div>
			     <div class="form-group col-md-3">
			      <label for="inputMaloai">Số Tiền Dư</label>
			      <input type="text" name="tiendu" class="form-control money numbers"  placeholder="Nhập tiền dư">
			    </div>
			    <div class="form-group col-md-3">
			      <label for="inputMaloai">Số Tiền Đi Chợ</label>
			      <input type="text" name="tiencho" class="form-control money numbers" id="mal" placeholder="Nhập tiền chợ">
			    </div>
			    <div class="form-group col-md-3">
			      <label for="inputMaloai">Tiền Cắm Hoa</label>
			      <input type="text" name="tiencamhoa" class="form-control money numbers" id="maloai" placeholder="Nhập tiền cắm hoa">
			    </div>
			    <div class="form-group col-md-3">
			      <label for="inputMaloai">Tiền Trò Chơi</label>
			      <input type="text" name="tientrochoi" class="form-control money numbers" id="s" placeholder="Nhập tiền trò chơi">
			    </div>
			    <div class="form-group col-md-9">
			      <label for="inputMaloai">Món Ăn</label>
			      <input type="text" name="monan" class="form-control" id="maloai" placeholder="Nhập các món ăn ... ">
			    </div>
		
			</div>
			
			
			<div class="form-group">
			    <label for="exampleFormControlTextarea1">Chi Tiêu Khác</label>
			    <textarea class="form-control" name="chitieukhac" id="exampleForm" rows="3"></textarea>
			  </div>
			  <button type="submit" class="btn btn-primary">Tạo Chi Tiêu</button>
			</form>
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