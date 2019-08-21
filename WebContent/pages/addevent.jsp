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
          <h1 class="h3 mb-2 text-gray-800">Thêm Sự Kiện Mới</h1>
          <form  method="POST" action="${pageContext.request.contextPath}/addevent">
			  <div class="form-row">
			      <div class="form-group col-md-4">
				      <label for="inputMaloai">Thể Loại</label>
				      <select id="inputMaloai" name="maloai" class="form-control">
				        <option selected value="1">Thánh Lễ</option>
				        <option value="2">Tĩnh Tâm</option>
				        <option value="3">Sự Kiện Khác</option>
				      </select>
			    </div>
			    <div class="form-group col-md-6">
			      <label for="inputTensukien">Tên Sự Kiện</label>
			      <input type="text" name="tensukien" class="form-control" id="tensukien" placeholder="Tên sự kiện">
			    </div>
			    <div class="form-group col-md-6">
			      <label for="inputTensukien">Địa Điểm</label>
			      <input type="text" name="diadiem" class="form-control" id="tensukien" placeholder="Địa điểm diễn ra">
			    </div>
			  </div>
			  <div class="form-row">
			    <div class="form-group col-md-3">
			      <label for="inputMaloai">Số Người Tham Gia</label>
			      <input type="number" name="slthamgia" class="form-control" id="maloai" placeholder="Nhập số lượng">
			    </div>
			    <div class="form-group col-md-3">
			      <label for="inputMaloai">Ngày Tổ Chức</label>
			      <input type="date" name="ngaytochuc" class="form-control" id="maloai" placeholder="">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputAddress2">Khách Mời</label>
			    <textarea class="form-control" name="khachmoi" id="exampleFormCont" rows="3"></textarea>
			  </div>
			  <div class="form-row">
			    <div class="form-group col-md-6">
			      <label for="inputCity">Người Tổ Chức</label>
			      
			      <input type="text" name="nguoitochuc" class="form-control" id="inputCity">
			    </div>
			  </div>
			  <button type="submit" class="btn btn-primary">Tạo Sự Kiện Mới</button>
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