//package com.dvst.domesticviolencesurvivortool.service;
//
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//import org.springframework.data.domain.AuditorAware;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//
//@Component
//public class UserAuditing implements AuditorAware<String>
//{
//
//    @Override
//    public Optional<String> getCurrentAuditor()
//    {
////        return Optional.of("SYSTEM");
//
//
//        // for OAuth2 systems
//        String uname;
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication != null)
//        {
//            uname = authentication.getName();
//        }
//        else
//        {
//            uname = "SYSTEM";
//        }
//        return Optional.of(uname);
//    }
//
//}