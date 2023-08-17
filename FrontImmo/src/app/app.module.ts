import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes} from '@angular/router'; // Importez le module RouterModule

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { SideNavComponent } from './side-nav/side-nav.component';
import { MainComponent } from './main/main.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { ListeLocataireComponent } from './liste-locataire/liste-locataire.component';

const routes: Routes = [
  { path: 'listeLocataire', component: ListeLocataireComponent },
  { path: 'accueil', component:  MainComponent},
  // Définissez les routes pour les autres pages
  { path: '', redirectTo: '/accueil', pathMatch: 'full' } // Redirection par défaut
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SideNavComponent,
    MainComponent,
    ListeLocataireComponent
  ],
  imports: [
    BrowserModule,
    FontAwesomeModule,
    RouterModule.forRoot(routes), // Ajoutez le RouterModule ici
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
