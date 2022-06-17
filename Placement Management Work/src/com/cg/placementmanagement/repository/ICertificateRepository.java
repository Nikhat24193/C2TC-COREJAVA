package com.cg.placementmanagement.repository;


import com.cg.placementmanagement.entity.Certificate;

public interface ICertificateRepository {
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(int id);
	public Certificate deleteCertificate(Certificate certificate);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
