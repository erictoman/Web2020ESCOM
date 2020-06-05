/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author eric
 */
public class arregloImagenesAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "images";
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        arregloImagenesForm s = (arregloImagenesForm) form;
        String ruta = this.getServlet().getServletContext().getRealPath("");
        ArrayList<String> paths = new ArrayList<>();
        int indice=0;
        for(FormFile file : s.getUpload()){
            FileOutputStream f = new FileOutputStream(ruta+"/"+file.getFileName());
            paths.add(file.getFileName());
            indice++;
            f.write(file.getFileData());
            f.close();
        }
        request.getSession().setAttribute("paths", paths);
        request.getSession().setAttribute("indice",0);
        return mapping.findForward(SUCCESS);
    }
}
