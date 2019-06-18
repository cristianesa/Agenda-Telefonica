import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListarComponent } from './contato/listar/listar.component';
import { EditarComponent } from './contato/editar/editar.component';
import { AdicionarComponent } from './contato/adicionar/adicionar.component';

const routes: Routes = [
  {path: 'listar', component: ListarComponent},
  {path: 'adicionar', component: AdicionarComponent},
  {path: 'editar', component: EditarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
