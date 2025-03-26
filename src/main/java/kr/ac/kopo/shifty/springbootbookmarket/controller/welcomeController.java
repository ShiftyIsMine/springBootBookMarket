package kr.ac.kopo.shifty.springbootbookmarket.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @RequestMapping(value="/home",method= RequestMethod.GET)
    public String welcomeMethod() {
        String welcomeHtml = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <title>Welcome Book Market</title>\n" +
                "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Hi Hello this is BookM</h1>\n" +
                "<h3>Hi Hello Shopping mall</h3>\n" +
                "\n" +
                "<main>\n" +
                "  <div class=\"container py-4\">\n" +
                "    <header class=\"pb-3 mb-4 border-bottom\">\n" +
                "      <a href=\"/\" class=\"d-flex align-items-center text-body-emphasis text-decoration-none\">\n" +
                "        <svg width=\"32px\" height=\"32px\" viewBox=\"0 0 24 24\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "          <path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M5 4C5 3.44772 5.44772 3 6 3V21C5.44772 21 5 20.5523 5 20V4ZM8 21V3H19V21H8ZM7 23H6C4.34315 23 3 21.6569 3 20V4C3 2.34315 4.34315 1 6 1H7H19C20.1046 1 21 1.89543 21 3V21C21 22.1046 20.1046 23 19 23H7Z\" fill=\"#000000\"/>\n" +
                "        </svg>\n" +
                "        <span class=\"fs-4\">&nbsp;BookMarket</span>\n" +
                "      </a>\n" +
                "    </header>\n" +
                "\n" +
                "    <div class=\"p-5 mb-4 bg-body-tertiary rounded-3\">\n" +
                "      <div class=\"container-fluid py-5\">\n" +
                "        <h1 class=\"display-5 fw-bold\">Welcome to My BookMarket</h1>\n" +
                "        <p class=\"col-md-8 fs-4\">BookMarket</p>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"row align-items-md-stretch text-center\">\n" +
                "      <div class=\"col-md-12\">\n" +
                "        <div class=\"h-100 p-5\">\n" +
                "          <h2>Welcome to Web Market</h2>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div class=\"col-md-6\">\n" +
                "        <div class=\"h-100 p-5 bg-body-tertiary border rounded-3\">\n" +
                "          <h2>Add borders</h2>\n" +
                "          <p>Or, keep it light and add a border for some added definition to the boundaries of your content. Be sure to look under the hood at the source HTML here as we've adjusted the alignment and sizing of both column's content for equal-height.</p>\n" +
                "          <button class=\"btn btn-outline-secondary\" type=\"button\">Example button</button>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <footer class=\"pt-3 mt-4 text-body-secondary border-top\">\n" +
                "      <span class = \"text-body-secondary\">&copy; 2025 BookMarket</span>\n" +
                "    </footer>\n" +
                "  </div>\n" +
                "</main>\n" +
                "</body>\n" +
                "</html>";
        return welcomeHtml;
    }

}
