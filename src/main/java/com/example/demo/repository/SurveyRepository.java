/*Group Members: 
Mrunmayee Bhagwat
Yash Jobalia
Tirth Shah

Entity class
Repository Interface
All methods from JPA Repository can be used directly.
*/

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Survey;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
}