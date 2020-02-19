package upload;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.Action;
import org.apache.struts.upload.FormFile;
import java.io.*;

public class StrutsUploadAction extends Action 
{
    @Override
    public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception{
        StrutsUploadForm myForm = (StrutsUploadForm) form;
        String ruta=this.getServlet().getServletContext().getRealPath("/");
        FormFile myFile = myForm.getTheFile();
        String contentType = myFile.getContentType();
        String fileName = myFile.getFileName();
        int fileSize = myFile.getFileSize();
        byte[] fileData = myFile.getFileData();
        System.out.println("contentType: " + contentType);
        System.out.println("File Name: " + fileName);
        System.out.println("File Size: " + fileSize);
        System.out.println(ruta);
        try (FileOutputStream grabador = new FileOutputStream(ruta + fileName)) {
            grabador.write(fileData);
            return mapping.findForward("success");
        }catch(Exception e){
            return mapping.findForward("failed");
        }
    }
}
