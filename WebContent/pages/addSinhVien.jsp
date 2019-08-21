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
          <h1 class="h3 mb-2 text-gray-800">Thêm sinh viên mới</h1>
          <form  action="${pageContext.request.contextPath}/addsinhvien" method="POST" enctype="multipart/form-data" acceptcharset="UTF-8">		
			  <div class="form-row">	  
			  	<div class="form-group col-md-6">
			      <label for="inputTensukien">Số chứng minh nhân dân :</label>
			      <input type="text" name="id" pattern="[0-9.]+" class="form-control" id="tensukien" placeholder="Chỉ nhập số">
			    </div>
			    
			  	<div class="form-group col-md-6">
			      <label for="inputTensukien">Tên sinh viên :</label>
			      <input type="text" name="tensinhvien" class="form-control" id="tensukien" placeholder="Nhập họ và tên">
			    </div>
			      <div class="form-group col-md-4">
				      <label for="inputMaloai">Giới tính</label>
				      <select id="inputgioitinh" name="gioitinh" class="form-control">
				        <option selected value="Nam">Nam</option>
				        <option value="Nữ">Nữ</option>
				      </select>
			    	</div>
			    <div class="form-group col-md-6">
			      <label for="inputTensukien">Địa chỉ :</label>
			      <input type="text" name="diachi" class="form-control" id="tensukien" placeholder="Nhập địa chỉ">
			    </div>
			    <div class="form-group col-md-6">
			      <label for="inputTensukien">Tên trường học :</label>
			      <input type="text" name="tentruonghoc" class="form-control" id="tensukien" placeholder="Tên trường học">
			    </div>
			  </div>
			  <div class="form-row">
			    <div class="form-group col-md-3">
			      <label for="inputMaloai">Ngành học :</label>
			      <input type="text" name="nganhhoc" class="form-control" id="nganhhoc" placeholder="Nhập ngành theo học">
			    </div>
			    <div class="form-group col-md-3">
			      <label for="inputMaloai">Ngày sinh :</label>
			      <input type="date" name="ngaysinh" class="form-control" id="maloai" placeholder="">
			    </div>
			  </div>
			  <div class="form-row">
			    <div class="form-group col-md-4">
			      <label for="inputCity">Số điện thoại</label> 
			      <input type="text" name="sdt" pattern="[0-9.]+" class="form-control" id="inputCity" placeholder="Chỉ nhập số ">
			    </div>
			  </div>
			 
		  		<div class="form-row">
			  	 	<label>Upload file : </label>
				 	<input type="file" value="Upload file" name="file" multiple accept='image/*' /> <!--   -->
			  </div>
			 
			 <c:choose>
			  <%-- Khi tham số color == 'red' --%>
			  <c:when test="${errorbool==true}">
			      <p style="color:red;">${errorString}</p>
			  </c:when>  
			  <%-- Các trường hợp khác --%>
			  <c:otherwise>
			  	  <p>${errorbool}</p>
			      <p style="color:blue;">${errorString}</p>
			  </c:otherwise>
			</c:choose>
			  <div class="form-row mt-4">
			  	 <div class="col-xs-12">
				  	 <div class="text-right"> 
				  	 	<button type="submit" class="btn btn-primary pull-right">Thêm sinh viên mới</button>
				  	 </div>
				 </div>
			  </div>
			 
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