/*package com.cg.oms.repository;

import java.util.ArrayList;

import com.cg.oms.entity.Branch;
import com.cg.oms.entity.Document;

public interface IDocumentRepository{

	public Document addDocument( Document document);
	public ArrayList<Document> viewAllDocumentDetails();
	public int deleteDocumentById(int documentId);
	public Document getDocumentById(int docId);
	public Document getDocumentByApplicantId(int applicationId);
	public Document getDocumentByEmailId(String emailId);
	public int deleteDocumentByEmail(String email);
	public int deleteDocumentByApplicationId(int applicationId);
	public int  updateDocument(Document docs);
}*/
package com.cg.oms.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.cg.oms.entity.Document;
@Repository
@NoRepositoryBean
public interface IDocumentRepository extends JpaRepository<Document, Integer>{

	//public Document addDocument( Document document);
	//public List<Document> viewAllDocumentDetails();
	//public Document  updateDocument(Document docs);
}
