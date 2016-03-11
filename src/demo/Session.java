package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Session")
public class Session extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public Session() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Cart cart = new Cart();
        cart.setTotalItems(7);
        session.setAttribute("cart", cart);
        getServletContext().getRequestDispatcher("/showcart.jsp").forward(req,resp);
    }
}
