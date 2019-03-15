package com.coll.test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coll.dao.BlogPostDAO;
import com.coll.model.*;
public class BlogPostDAOJunitTestCase
{
	BlogPostDAO blogPostDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.coll");
		context.refresh();
		
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
	
	public void addBlogPostTestCase()
	{
		userDetails=userDetailsService.getUserDetails("tom12");
		blogPost.setBlogTitle("Blog Title 2");
		blogPost.setBlogDescription("This is Blog Description 2!");
		blogPost.setPostedBy(userDetails);
		blogPost.setPostedOn(new Date());
		blogPost.setApproved("A");
		
		blogPostService.insertOrUpdateBlogPost(blogPost);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
