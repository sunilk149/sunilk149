package com.coll.dao;

import java.util.List;

import com.coll.model.BlogComment;
import com.coll.model.BlogPost;
import com.coll.model.UserDetails;

public interface BlogPostDAO {
	void insertOrUpdateBlogPost(BlogPost blogPost);
	List<BlogPost> getBlogPosts(String approved);
	BlogPost getBlogPostById(int id);
	List<BlogPost> getBlogPostsByUser(UserDetails user);
	void deleteBlogPost(BlogPost blogPost);
	void addBlogComment(BlogComment blogComment);
	List<BlogComment> getAllBlogComment(int blog_id);
}
