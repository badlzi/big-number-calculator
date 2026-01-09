package ngocquy.bignumberweb;

import main.MyBigNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("number1") String number1,
                            @RequestParam("number2") String number2,
                            Model model) {
        try {
            MyBigNumber myBigNumber = new MyBigNumber();
            String result = myBigNumber.sum(number1, number2);
            model.addAttribute("number1", number1);
            model.addAttribute("number2", number2);
            model.addAttribute("result", result);
            model.addAttribute("steps", myBigNumber.getSteps());
        } catch (NumberFormatException e) {
            model.addAttribute("error", "Lỗi: Vui lòng nhập hai số hợp lệ.");
        } catch (Exception e) {
            model.addAttribute("error", "Đã xảy ra lỗi không mong muốn: " + e.getMessage());
        }
        return "index";
    }
}
