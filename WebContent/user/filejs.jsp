	
	
<script>

function modalMess(thongbao,text,url){
	document.getElementById("thongbao").innerHTML = thongbao;
    document.getElementById("text").innerHTML = text;
    document.getElementById("linkurl").innerHTML = '<a class="btn btn-primary" href="'+ url +'">Xóa</a>';
}

window.onload = function() {
	  //YOUR JQUERY CODE
	$('.money').simpleMoneyFormat();
	  
	$("input.numbers").keypress(function(event) {
		  return /\d/.test(String.fromCharCode(event.keyCode));
	});	  
	
}

</script>

<!-- Bootstrap core JavaScript-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Page level plugins -->
<script src="vendor/datatables/jquery.dataTables.min.js"></script>
<script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="vendor/chart.js/Chart.min.js"></script>

<!-- Page level custom scripts -->
<script src="js/demo/chart-area-demo.js"></script>
<script src="js/demo/chart-pie-demo.js"></script>

<!-- Page level custom scripts -->
<script src="js/demo/datatables-demo.js"></script>

<!-- format money 100,000 -->>
<script src="js/simple.money.format.js"></script>


  