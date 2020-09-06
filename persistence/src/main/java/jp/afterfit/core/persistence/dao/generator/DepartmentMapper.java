package jp.afterfit.core.persistence.dao.generator;

import java.util.List;
import jp.afterfit.core.domain.entity.generator.Department;
import jp.afterfit.core.domain.entity.generator.DepartmentCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.department
     *
     * @mbg.generated
     */
    long countByExample(DepartmentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.department
     *
     * @mbg.generated
     */
    int deleteByExample(DepartmentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.department
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.department
     *
     * @mbg.generated
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.department
     *
     * @mbg.generated
     */
    int insertSelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.department
     *
     * @mbg.generated
     */
    List<Department> selectByExampleWithRowbounds(DepartmentCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.department
     *
     * @mbg.generated
     */
    List<Department> selectByExample(DepartmentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.department
     *
     * @mbg.generated
     */
    Department selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.department
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.department
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.department
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.department
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Department record);
}