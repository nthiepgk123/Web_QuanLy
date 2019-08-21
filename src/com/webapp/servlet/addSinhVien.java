package com.webapp.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import com.webapp.beans.SinhVien;
import com.webapp.library.RenameFileAddlibrary;
import com.webapp.utils.MyUtils;
import com.webapp.utils.SinhVienUtils;

@WebServlet(urlPatterns= {"/addsinhvien"})
@MultipartConfig
public class addSinhVien extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public addSinhVien() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setAttribute("active_url", "addsinhvien");
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/pages/addSinhVien.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		/*String id = request.getParameter("id");
		String ten = request.getParameter("tensinhvien");
		String gioitinh = request.getParameter("gioitinh");
		String diachi = request.getParameter("diachi");
		String tentruonghoc = request.getParameter("tentruonghoc");
		String nganhhoc = request.getParameter("nganhhoc");
		String ngaysinh = request.getParameter("ngaysinh");
		String sodienthoai = request.getParameter("sdt");
		*/
		/*
		String avatarImg = id + "_" + System.nanoTime() + ".png";
		SinhVien sv = new SinhVien();
		sv.setID(id);
		sv.setHOTEN(ten);
		sv.setGIOITINH(gioitinh);
		sv.setDIACHI(diachi);
		sv.setTENTRUONGHOC(tentruonghoc);
		sv.setNGAYSINH(ngaysinh);
		sv.setKHOA_MAKHOA(nganhhoc);
		sv.setSDT(sodienthoai);
		sv.setAVATAR(avatarImg);
		
		Connection conn = MyUtils.getStoredConnection(request);
		try {
			//if(SinhVienUtils.Tim_SinhVien(conn, id) == null)
				//SinhVienUtils.addSinhVien(conn, sv);		
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		// test upload
	    //String note = request.getParameter("note"); // Retrieves <input type="text" name="description">
	    //Part filePart = request.getPart("file"); // Retrieves <input type="file" name="file">
	   // String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
	   // InputStream fileContent = filePart.getInputStream();
		//
		//
		// upload hinh anh ca nhan
		String errorString = null;
		boolean errorbool = false;
		 try {
			 	String nameFile = null;
			 	SinhVien sv = new SinhVien();
		        List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
		        // lay du lieu thong tin sinh vien
		        for(FileItem item : items) {
		        	if (item.isFormField()) {
		                // Process regular form field (input type="text|radio|checkbox|etc", select, etc).
		                String fieldName = item.getFieldName();
		                switch(fieldName) {
		                	case "id":
		                		sv.setID(item.getString());
		                		break;
		                	case "tensinhvien":
		                		sv.setHOTEN(item.getString("UTF-8"));
		                		break;
		                	case "gioitinh":
		                		sv.setGIOITINH(item.getString("UTF-8"));
		                		break;
		                	case "diachi":
		                		sv.setDIACHI(item.getString("UTF-8"));
		                		break;
		                	case "tentruonghoc":
		                		sv.setTENTRUONGHOC(item.getString("UTF-8"));
		                		break;
		                	case "nganhhoc":
		                		sv.setKHOA_MAKHOA(item.getString("UTF-8"));
		                		break;
		                	case "ngaysinh":
		                		sv.setNGAYSINH(item.getString());
		                		break;
		                	default:
		                		sv.setSDT(item.getString());
		                }
		        	}
		        }
		        
		        String avatarImg = sv.getID() + "_" + System.nanoTime() + ".png";
		        sv.setAVATAR(avatarImg);
		        Connection conn = MyUtils.getStoredConnection(request);
				try {
					if(SinhVienUtils.Tim_SinhVien(conn, sv.getID()) == null)
						SinhVienUtils.addSinhVien(conn, sv);
					else {
						errorbool = true;
						errorString = "Số chứng minh nhân dân bị trùng !";
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					errorbool = true;
					errorString = "Thêm sinh viên không thành công";
				}
		        for (FileItem item : items) {
		        	 // Process form file field (input type="file").
		        	if (!item.isFormField()) {
		        		String fieldName = item.getFieldName();
		                String fileName = FilenameUtils.getName(item.getName());
		                if(!fileName.equals("")) {
		                	InputStream fileContent = item.getInputStream();
			                String dirUrl = request.getServletContext()
									.getRealPath("") + File.separator + "images//avatars";
							File dir = new File(dirUrl);
							if (!dir.exists()) {
								dir.mkdir();
							}
							String fileImg = dirUrl + File.separator + avatarImg;
							File file = new File(fileImg);
							try {
								item.write(file);
								System.out.println("UPLOAD THÀNH CÔNG !!!");
							} catch (Exception e) {
								System.out.println("CÓ LỖI TRONG QUÁ TRÌNH UPLOAD !!!");
								e.printStackTrace();
							}
		                }          
		        	}    
		        }
		        if(errorbool == false)
		        	errorString = "THÊM SINH VIÊN THÀNH CÔNG !!!";
				
		    } catch (FileUploadException e) {
		    	errorbool = true;
				errorString = "LỖI KHÔNG THỂ THÊM SINH VIÊN";
		        throw new ServletException("Cannot parse multipart request.", e);
		    }
		
		
		/*
		 * String description = request.getParameter("description"); // Retrieves <input
		 * type="text" name="description"> Part filePart1 = request.getPart("file"); //
		 * Retrieves <input type="file" name="file"> String fileName1 =
		 * Paths.get(filePart1.getSubmittedFileName()).getFileName().toString(); // MSIE
		 * fix. InputStream fileContent1 = filePart1.getInputStream();
		 * 
		 * 
		 * 
		 * if(filePart1 != null) { if(filePart1.getName().equals("")) { String dirUrl =
		 * request.getServletContext().getRealPath("") + File.separator +
		 * "images//avatars"; File dir = new File(dirUrl); if(!dir.exists()) {
		 * dir.mkdir(); } String fileImg = dirUrl + File.separator + "ok.png";; File
		 * file = new File(fileImg);
		 * 
		 * } }
		 */
	    request.setAttribute("errorbool", errorbool);
	    request.setAttribute("errorString", errorString);
	    
	    RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/addSinhVien.jsp");
  	  	dispatcher.forward(request, response); 
	}
	
	
	
}
