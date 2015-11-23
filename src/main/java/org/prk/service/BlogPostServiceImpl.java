package org.prk.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.prk.domain.BlogPost;
import org.prk.domain.User;
import org.springframework.stereotype.Service;

@Service 
public class BlogPostServiceImpl implements BlogPostService{

	
	private static Map<User,List<BlogPost>> userPostsMap  = new HashMap<User,List<BlogPost>>(10);
	@Override
	public void addPostForUser(User user, BlogPost post) {

		if(userPostsMap.get(user) != null){
			userPostsMap.get(user).add(post);
		}else{
			List<BlogPost> postList = new ArrayList<BlogPost>();
			postList.add(post);
			userPostsMap.put(user, postList);
		}
		
	}

	@Override
	public List<BlogPost> fetchBlogPostbyUser(User user) {
		
		return userPostsMap.get(user);
	}
	
}
