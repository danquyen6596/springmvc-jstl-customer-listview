import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/jstlCustomer")
public class CustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CustomerServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> list = CustomerDB.queryCustomer();

        request.setAttribute("customer", list);

        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}
