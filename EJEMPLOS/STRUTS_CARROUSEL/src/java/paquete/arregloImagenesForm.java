package paquete;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author eric
 */
public class arregloImagenesForm extends org.apache.struts.action.ActionForm {
    private ArrayList<FormFile> uploaded = new ArrayList<>(); 
    public void setUpload(List<FormFile> file) { uploaded.addAll(file); }
    public List<FormFile> getUpload() { return uploaded; }
}
