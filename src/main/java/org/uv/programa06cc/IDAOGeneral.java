package org.uv.programa06cc;

import java.util.List;

/**
 *
 * @author ZS20006736
 */
public interface IDAOGeneral<T, ID>{
    public T create(T v);
    public boolean delete(ID id);
    public T update(ID id, T vN);
    
    public List<T> findAll();
    public T findById(ID id);
}
