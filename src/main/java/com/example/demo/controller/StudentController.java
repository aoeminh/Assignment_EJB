package com.example.demo.controller;

import com.example.demo.interfaces.AttendanceDeteailModel;
import com.example.demo.interfaces.AttendanceSlotModel;
import com.example.demo.interfaces.StudentModel;
import com.example.demo.model.AttendanceDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class StudentController {
    @Autowired
    private StudentModel studentModel;
    @Autowired
    private AttendanceSlotModel attendanceSlotModel;
    @Autowired
    AttendanceDeteailModel attendanceDeteailModel;


    @RequestMapping(path = "/attend/list", method = RequestMethod.GET)
    public String listAllProduct(Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int limit) {
        model.addAttribute("pagination", attendanceSlotModel.findAll());
//        model.addAttribute("page", page);
//        model.addAttribute("limit", limit);
        // model.addAttribute("datetime",
        return "timeslot";
    }
    @RequestMapping(path = "/attend/view/{id}", method = RequestMethod.GET)
    public String editProduct(@PathVariable long id, Model model) {
        Optional<AttendanceDetails> optionalProduct = attendanceDeteailModel.findById(id);
       model.addAttribute("attendDetails",optionalProduct );
       return "attendDetails";
    }


}
