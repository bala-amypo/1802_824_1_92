

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.CrimeReport;

public interface CrimeReportRepository extends JpaRepository<CrimeReport, Long> {}


