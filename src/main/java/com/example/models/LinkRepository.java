package com.example.models;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.models.Pojo.Link;

@Repository
@EnableJpaRepositories
public interface LinkRepository extends JpaRepository<Link,Long>{
	
	@Query(value="SELECT id from Link order by Id desc limit 1",nativeQuery = true)
	public Long getLastLinkId();
	
	@Query(value="SELECT * from Link where shorten_id= :shorten_id",nativeQuery=true)
	public Link getLink(@Param(value = "shorten_id") String shorten_id);
	
	
}
