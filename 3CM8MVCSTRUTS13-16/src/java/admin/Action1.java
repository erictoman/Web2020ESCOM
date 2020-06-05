package admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Action1 extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginBean checker = new LoginBean();
        ActionForm1 forma=(ActionForm1)form;
        System.out.println(forma.getId());
        System.out.println(forma.getPassword());
        if(checker.validateUser(forma.getId(),forma.getPassword())){
            return mapping.findForward(SUCCESS);
        }
        else{
            return mapping.findForward(FAIL);
        }
    }
}
