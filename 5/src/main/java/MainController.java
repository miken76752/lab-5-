

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@Controller
public class MainController {
    private final DAO studenDAO = new DAO();
    @GetMapping("/marks")
    public String ShowMarks(@RequestParam(value = "id") Integer id , Model model) throws SQLException {

        model.addAttribute("student" , studenDAO.FindStudent(id));
        return "/mark";
    }

}