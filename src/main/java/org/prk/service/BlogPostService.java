package org.prk.service;

import java.util.List;

import org.prk.domain.BlogPost;
import org.prk.domain.User;

public interface BlogPostService {

	void addPostForUser(User user,BlogPost post);
	List<BlogPost>  fetchBlogPostbyUser(User user);
}
