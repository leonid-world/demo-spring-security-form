package me.whiteship.demospringsecurityform.form;

import java.util.Collection;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

  public void dashboard() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

    //인증한 사용자 정보
    Object principal = authentication.getPrincipal();

    //사용자의 권한정보(다수)
    Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

    Object credentials = authentication.getCredentials();

    //인증된 사용자인가?
    boolean authenticated = authentication.isAuthenticated();
  }

}
