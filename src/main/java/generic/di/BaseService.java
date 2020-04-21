package generic.di;

import org.springframework.beans.factory.annotation.Autowired;


public class BaseService<T> {



    @Autowired
    private BaseRepository<T> baseRepository;

    public void add(){
        System.out.println("add");
        System.out.println(baseRepository);
        baseRepository.add();

    }

}
