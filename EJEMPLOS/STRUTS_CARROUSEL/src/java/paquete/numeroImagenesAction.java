/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author eric
 */
public class numeroImagenesAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        numeroImagenesForm formulario = (numeroImagenesForm) form;
        request.getSession().setAttribute("numero", formulario.getNumero());
        System.out.println(formulario.getNumero());
        System.out.println(request.getSession().getAttribute("numero"));
        return mapping.findForward(SUCCESS);
    }
}
