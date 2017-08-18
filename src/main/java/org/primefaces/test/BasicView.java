package org.primefaces.test;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.TreeNode;

@ManagedBean(name = "treeTableBasicView")
@ViewScoped
public class BasicView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 472201915560013785L;

	private TreeNode root;

	private TreeNode filteredNode;

	private Document selectedDocument;

	@ManagedProperty("#{treeTableDocumentService}")
	private DocumentService service;

	@PostConstruct
	public void init() {
		root = service.createDocuments();
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setService(DocumentService service) {
		this.service = service;
	}

	public Document getSelectedDocument() {
		return selectedDocument;
	}

	public void setSelectedDocument(Document selectedDocument) {
		this.selectedDocument = selectedDocument;
	}

	public TreeNode getFilteredNode() {
		return filteredNode;
	}

	public void setFilteredNode(TreeNode filteredNode) {
		this.filteredNode = filteredNode;
	}
}
