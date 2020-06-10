package admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Action1 extends org.apache.struts.action.Action {

    private static final String welcome = "welcome";
    private static final String fail = "fail";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginBean checker = new LoginBean();
        ActionForm1 forma=(ActionForm1)form;
        if(checker.validateUser(forma.getId(),forma.getPassword())){
            request.getSession().setAttribute("id",forma.getId());
            return mapping.findForward(welcome);
        }
        else{
            return mapping.findForward(fail);
        }
    }
}
