package com.cg.oms.serviceimpl;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.oms.entity.Document;
import com.cg.oms.exception.DocumentNotFoundException;
import com.cg.oms.repository.IDocumentRepository;
import com.cg.oms.service.IDocumentService;
@Service
public class IDocumentServiceImpl implements IDocumentService {
	@Qualifier("iDocumentRepository")
	private IDocumentRepository iDocumentRepo;

	@Override
	public Document addDocument(Document document) {
		// TODO Auto-generated method stub
		//logger.info("Entered addDocument()");
		if(document == null)
			throw new DocumentNotFoundException("No Documents Found");
		else {
			iDocumentRepo.save(document);

			return document;
		}
		//return iDocumentRepository.save(document);
	}

	@Override
	public List<Document> viewAllDocumentDetails() {
		// TODO Auto-generated method stub
		//logger.info("Entered viewAllDocuments()");
			List<Document> allDocuments = iDocumentRepo.findAll();
			if(allDocuments.isEmpty()) {
				throw new DocumentNotFoundException("No Documents Found");
			}

			return allDocuments;
			//return document;
		}

	@Override
	public Document updateDocument(Document document) {
		// TODO Auto-generated method stub
		if(document == null) {
			throw new DocumentNotFoundException("No Documents Found");
		}else {
			iDocumentRepo.save(document);
			return document;
		}
	}
		//return iDocumentRepository.save(document) ;
}
