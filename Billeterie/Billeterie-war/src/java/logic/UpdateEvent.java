/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import ejb.EventBean;
import entities.Event;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static logic.CreateEvent.CHAMP_ADDRESS;
import static logic.CreateEvent.CHAMP_DATE;
import static logic.CreateEvent.CHAMP_DETAIL;
import static logic.CreateEvent.CHAMP_ID;
import static logic.CreateEvent.CHAMP_PRICE;

/**
 *
 * @author mathieu
 */
@WebServlet(name = "UpdateEvent", urlPatterns = {"/UpdateEvent"})
public class UpdateEvent extends HttpServlet {

    @EJB
    private EventBean ejb;
    
    public static final String CHAMP_ID = "id";    
    public static final String CHAMP_ADDRESS = "address";
    public static final String CHAMP_PRICE = "price";
    public static final String CHAMP_DATE = "date";
    public static final String CHAMP_DETAIL = "detail";
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateEvent</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateEvent at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String s = request.getParameter("id");
        long id = Long.parseLong(s);
        Event e = ejb.getEvent(id);
        request.setAttribute("event", e);
        request.getRequestDispatcher("FormEvent.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter( CHAMP_ID );
        String address = request.getParameter( CHAMP_ADDRESS );
        String price = request.getParameter( CHAMP_PRICE );
        String detail = request.getParameter( CHAMP_DETAIL );
        String dateNP = request.getParameter( CHAMP_DATE );
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date date;    
        
        
        Event e = new Event();
        e.setAddress(address);
        e.setPrice(Float.parseFloat(price));
        e.setId(Long.parseLong(id));
        e.setDetail(detail);
        try {
            date = format.parse ( dateNP );
            e.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(CreateEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        ejb.merge(e);
        
        response.sendRedirect("events");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
