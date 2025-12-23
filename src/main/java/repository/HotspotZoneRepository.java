// package com.example.demo.repository;

// import com.example.demo.entity.HotspotZone;
// import org.springframework.data.jpa.repository.JpaRepository;

// public interface HotspotZoneRepository extends JpaRepository<HotspotZone, Long> {
// }



UserRepository.java
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {}

HotspotZoneRepository.java
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.HotspotZone;

public interface HotspotZoneRepository extends JpaRepository<HotspotZone, Long> {}
