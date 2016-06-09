/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb138.cvmanager.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;

/**
 *
 * @author david
 */
@Controller
public class BaseController {

    protected String getPrincipalUsername() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) auth.getPrincipal();
        return userDetails.getUsername();
    }

//    protected String getPrincipalUsername() {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        UserDetails userDetails = null;
//        if (auth != null) {
//            userDetails = (UserDetails) auth.getPrincipal();
//        }
//        if(userDetails == null){
//            return null;
//        } else {
//            return userDetails.getUsername();
//        }
//    }
}