package escom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author eric
 */
public class Action2 extends org.apache.struts.action.Action {
    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
            ActionForm2 formulario = (ActionForm2) form;
            if(formulario.getId().compareTo("UWU")==0){
                return mapping.findForward(SUCCESS);    
            }
            return mapping.findForward(FAIL);
    }
}
