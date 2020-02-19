package upload;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class StrutsUploadForm extends ActionForm {
  private FormFile theFile;
  /**
   * @return Returns the theFile.
   */
  public FormFile getTheFile() {
    return theFile;
  }
  /**
   * @param theFile The FormFile to set.
   */
  public void setTheFile(FormFile theFile) {
    this.theFile = theFile;
  }
}
