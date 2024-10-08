package com.app.MyFrontEndProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.MyBackEndProject.DAO.ProductDAO;
import com.app.MyBackEndProject.Modal.Product;


@Controller
@RequestMapping("/json/data")
public class JsonController 
{
	
	@Autowired
	ProductDAO productDAO ;
	
	
	@RequestMapping("/all/active/products")
	@ResponseBody
	public List<Product> getAllActiveProducts() {
		return productDAO.listActiveProducts();
	}
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProducts() {
		return productDAO.listProduct();
	}
	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getProductsByCategory(@PathVariable int id) {
		return productDAO.listActiveProductsByCategory(id);
	}
	
	@RequestMapping("/top/purchased/products")
	@ResponseBody
	public List<Product> getTopPurchasedProduct() {
		return productDAO.topPurchasedProduct();
	}

}

