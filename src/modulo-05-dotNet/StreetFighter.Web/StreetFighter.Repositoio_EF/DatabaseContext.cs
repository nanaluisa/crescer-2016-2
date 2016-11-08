using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Data.Entity.ModelConfiguration.Conventions;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Repositoio_EF
{
    public class DatabaseContext : DbContext
    {
        public DatabaseContext() : base("StreetFighter")
        {

        }

        //public DbSet<Personagem> Personagem { get; set; }


        
        //public DbSet<UserRole> UserRole { get; set; }

       //reescrevendo para não pluralizar os nomes das tabelas.
        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Conventions.Remove<PluralizingTableNameConvention>();
            base.OnModelCreating(modelBuilder);
        }
    }
} 








    }
}
