package com.lamtraining.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtils {
	
	public static MyUserDetail getMyUserDetail() {
		return (MyUserDetail) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
	}
	
	public static List<String> getAuthorities() {
        List<String> results = new ArrayList<String>();
        List<GrantedAuthority> authorities = (List<GrantedAuthority>)(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        for (GrantedAuthority authority : authorities) {
            results.add(authority.getAuthority());
        }
        return results;
    }
}
