import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarComponent } from './contato/listar/listar.component';
import { EditarComponent } from './contato/editar/editar.component';
import { ExcluirComponent } from './contato/excluir/excluir.component';
import { AdicionarComponent } from './contato/adicionar/adicionar.component';
import { CollapseModule } from 'ngx-bootstrap/collapse';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    ListarComponent,
    EditarComponent,
    ExcluirComponent,
    AdicionarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CollapseModule.forRoot(),
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
