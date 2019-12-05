package com.example.demo;

import jdk.nashorn.internal.runtime.ErrorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import javax.xml.transform.Result;

@Controller
public class HomeController {

    @Autowired
    JobRepository jobRepository;

    @RequestMapping("/")
    public String listJobs(Model model){
        model.addAttribute("jobs", jobRepository.findAll());
        return "list";

    }
    @GetMapping("/add")
        public String jobForm(Model model){
        model.addAttribute("jobs", new Job());
        return "jobform";
        }

        @PostMapping("/process")
    public String processForm(@Valid Job job,
           BindingResult result) {

        if (result.hasErrors()){
        return "jobform";
            }
    jobRepository.save(job);
    return "redirect:/";
}

@RequestMapping("/detail/{id}")
public String showJob(@PathVariable("id") long id, Model model)
{
    model.addAttribute("job", jobRepository.findById(id).get());
  return "show";
}
@RequestMapping("/update/{id}")
public String updateJob(@PathVariable("id") long id,
Model model){
 model.addAttribute("job", jobRepository.findById(id).get());
   return "jobform";
    }

@RequestMapping("/delete{id}")
public String delJob(@PathVariable("id") long id){
        jobRepository.deleteById(id);
return "redirect:/";
    }
}


