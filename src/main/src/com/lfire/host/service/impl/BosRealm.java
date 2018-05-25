package com.lfire.host.service.impl;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfire.host.entity.demo.User;

@Service("bosRealm")
public class BosRealm extends AuthorizingRealm {
	@Autowired
	private UserServiceImpl userServiceImpl;

	/* 
	 * ����SecurityUtils.getSubject().isPermitted�����������ʱ
	 *
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
		System.out.println("---��Ȩ---");
		String username = (String)pc.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
	    authorizationInfo.setRoles(userServiceImpl.getRoles(username));
	    authorizationInfo.setStringPermissions(userServiceImpl.getPermissions(username));
		return authorizationInfo;
	}

	/* 
	 * ִ��SecurityUtils.getSubject().login������ʱ�����
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		System.out.println("---��֤---");
		String username = (String) token.getPrincipal(); // �õ��û���
		String password = new String((char[]) token.getCredentials()); // �õ�����

		User user = userServiceImpl.findById(1);
		return new SimpleAuthenticationInfo(username, password, getName());
	}

}
