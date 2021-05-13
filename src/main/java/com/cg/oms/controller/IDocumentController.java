package com.cg.oms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.oms.entity.Document;
//import com.cg.oms.entity.Student;
import com.cg.oms.service.IDocumentService;

@RestController
@RequestMapping("/Document/api")
public class IDocumentController {
	@Autowired
    private IDocumentService iDocumentService;
    @GetMapping(path="/Documentdetails")
    public ResponseEntity<List<Document>> viewAllDocumentDetails()
    {
        List<Document> list = iDocumentService.viewAllDocumentDetails();
        return new ResponseEntity<List<Document>>(list,HttpStatus.OK);
       
    }
    @PostMapping(path="/addDocument")
    public ResponseEntity <Document> addDocument(@RequestBody Document d)
    {
        Document doc = iDocumentService.addDocument(d);
        return new ResponseEntity <Document> (doc,HttpStatus.OK);
       
    }
    @PutMapping("/Document/{documentId}")
    public ResponseEntity <Document> updateDocument(@PathVariable(value="documentId") int documentId,@RequestBody Document documentDetails){
    	Document document = iDocumentService.updateDocument(documentDetails);
    			return new ResponseEntity <Document> (document,HttpStatus.OK);
}
}
